// GenRandom
#include "stdafx.h"


// Be careful with Copy and Paste
//   we are using __stdcall set through
//   Project Settings...
#pragma warning( disable: 4100 )
int __cdecl main(int argc, _TCHAR* argv[])
{
   fnCryptAcquireContext lpCryptAcquireContext = NULL;
   fnCryptReleaseContext lpCryptReleaseContext = NULL;
   fnCryptGenRandom lpCryptGenRandom = NULL;

   HINSTANCE hAAPI32 = NULL;
   HCRYPTPROV hProvider = NULL;
         
   try
   {
      hAAPI32 = ::LoadLibrary( _T("AdvAPI32.dll") );
      if( NULL == hAAPI32 )
         { throw _T("LoadLibrary failed."); }

      // Function Pointer: CryptAcquireContext
      lpCryptAcquireContext = reinterpret_cast< fnCryptAcquireContext >
        #ifdef UNICODE
          ( ::GetProcAddress( hAAPI32, "CryptAcquireContextW" ) );
        #else
          ( ::GetProcAddress( hAAPI32, "CryptAcquireContextA" ) );
        #endif
      if( NULL == lpCryptAcquireContext )
         { throw _T("GetProcAddress failed - CryptAcquireContext."); }         

      // Function Pointer: CryptReleaseContext
      lpCryptReleaseContext = reinterpret_cast< fnCryptReleaseContext >
         ( ::GetProcAddress( hAAPI32, "CryptReleaseContext" ) );
      if( NULL == lpCryptReleaseContext )
         { throw _T("GetProcAddress failed - CryptReleaseContext."); }
      
      // Function Pointer: CryptGenRandom
      lpCryptGenRandom = reinterpret_cast< fnCryptGenRandom >
          ( ::GetProcAddress( hAAPI32, "CryptGenRandom" ) );
       
      if( NULL == lpCryptGenRandom )
         { throw _T("GetProcAddress failed - CryptGenRandom."); }
            
      // Setup
      BOOL bResult = (*lpCryptAcquireContext)(
         &hProvider,          // handle to the CSP
         NULL,                // NULL: use logon name
         NULL,                // NULL: use default provider
         PROV_RSA_FULL,       // provider type
         // 0                    // can cause NTE_BAD_KEYSET
         CRYPT_MACHINE_KEYSET // flag value
      );

      if( FALSE == bResult )
         { throw _T("CryptAcquireContext failed."); }

      // if 0 == dwFlags and NTE_BAD_KEYSET( 0x80090016 )
      //   The key container could not be opened. A common cause of this
      //   error is that the key container does not exist. To create a key
      //   container, call CryptAcquireContext using the CRYPT_NEWKEYSET flag.
      //   This error code can also indicate that access to an existing key
      //   container is denied. Access rights to the container can be granted
      //   by the key set creator by using CryptSetProvParam.

      const UINT BUFFERSIZE = 8;
      BYTE pcbScratch[ BUFFERSIZE ];
      
      bResult = (*lpCryptGenRandom)( hProvider, BUFFERSIZE, pcbScratch );
      if( FALSE == bResult )
         { throw _T("CryptGenRandom failed."); }      

      for( UINT i = 0; i < BUFFERSIZE; i++ )
      {
         INT x = pcbScratch[ i ];
         
         #ifdef UNICODE
           std::wcout << L"0x" << std::hex << std::setw( 2 );
           std::wcout << std::setfill( L'0' ) << x << L" ";
         #else
           std::cout << "0x" << std::hex << std::setw( 2 );
           std::cout << std::setfill( '0' ) << x << " ";
         #endif      
      }

   } // try

   catch( LPCTSTR szError )
   {
     ::OutputDebugStr( szError ); ::OutputDebugStr( _T("\n") );

     #ifdef UNICODE
        std::wcerr << szError << std::endl;
     #else
        std::cerr << szError << std::endl;
     #endif
   }
   catch(...)
      { ; }

   if( NULL != hAAPI32 ) {       
      
      // Free the Context
      if( NULL != hProvider && 
          NULL != lpCryptReleaseContext ) {
          (fnCryptReleaseContext)(hProvider, 0);
      }

      // Free the Library
      ::FreeLibrary( hAAPI32 );
   }
 
	return 0;
}

