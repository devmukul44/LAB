// stdafx.h : include file for standard system include files,
// or project specific include files that are used frequently, but
// are changed infrequently
//
#pragma once

#include <windows.h>
#include <iostream>
#include <iomanip>
#include <tchar.h>

// #ifndef ULONG_PTR
   // typedef unsigned __int64 ULONG_PTR, *PULONG_PTR;
   typedef unsigned __int32 ULONG_PTR, *PULONG_PTR;
// #endif
  
#ifndef HCRYPTPROV
   typedef ULONG_PTR HCRYPTPROV ;    // WinCrypt.h, line 249
#endif

#ifndef CRYPT_MACHINE_KEYSET
#  define CRYPT_MACHINE_KEYSET 0x20
#endif

#ifndef PROV_RSA_FULL
#  define PROV_RSA_FULL 1
#endif

// BOOL WINAPI CryptGenRandom(
//   HCRYPTPROV hProv, DWORD dwLen,
//   BYTE* pbBuffer
//);
typedef BOOL (*fnCryptGenRandom) 
   (HCRYPTPROV, DWORD, BYTE*); 

//BOOL WINAPI CryptAcquireContext(
//  HCRYPTPROV* phProv, LPCTSTR pszContainer,
//  LPCTSTR pszProvider, DWORD dwProvType,
//  DWORD dwFlags
//);
typedef BOOL (*fnCryptAcquireContext)
   (HCRYPTPROV*, LPCTSTR, LPCTSTR, DWORD, DWORD);

// BOOL WINAPI CryptReleaseContext(
//   HCRYPTPROV hProv, DWORD dwFlags
// );
typedef BOOL (*fnCryptReleaseContext)
   (HCRYPTPROV, DWORD);
