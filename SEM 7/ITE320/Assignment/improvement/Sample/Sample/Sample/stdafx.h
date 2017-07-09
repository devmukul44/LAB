// stdafx.h : include file for standard system include files,
// or project specific include files that are used frequently, but
// are changed infrequently
//

#pragma once

#ifndef _WIN32_WINNT		// Allow use of features specific to Windows XP or later.                   
#define _WIN32_WINNT 0x0501	// Change this to the appropriate value to target other versions of Windows.
#endif

// Runtime Includes
#include <iostream>
#include <string>

// Crypto++ Library
#ifdef _DEBUG
#  pragma comment( lib, "cryptlibd" )
#else
#  pragma comment( lib, "cryptlib" )
#endif

// Unicode
#ifdef UNICODE
#  define tcout wcout
#else
#  define tcout cout
#endif
