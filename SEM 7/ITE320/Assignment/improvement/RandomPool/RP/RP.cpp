// sample.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

// Runtime Library Includes
#include <string>
#include <iostream>
#include <iomanip>

// Crypto++ Include
#include "randpool.h" // PRNG

// From RandomPool.cpp:
//   typedef MDC<SHA> RandomPoolCipher;

int main(int argc, char* argv[])
{
   // Must be at least 16 for RandomPool
   const unsigned int SEEDSIZE = 16;
   byte pcbSeed[ SEEDSIZE ];

   // Scratch Area
    const unsigned int BLOCKSIZE = 16 * 8;
    byte pcbScratch[ BLOCKSIZE ];

    // Random Block Initalization
    CryptoPP::RandomPool rng( SEEDSIZE /* Default Ctor: 384 */ );
    rng.Put( pcbSeed, SEEDSIZE );
    
    rng.GenerateBlock( pcbScratch, BLOCKSIZE );

    // Output
    std::cout << "The generated random block is:" << std::endl;
    for( unsigned int i = 0; i < BLOCKSIZE; i++ )
    {
        std::cout << "0x" << std::setbase(16) << std::setw(2) << std::setfill('0');
        std::cout << static_cast<unsigned int>( pcbScratch[ i ] ) << " ";
    }
    std::cout << std::endl;

    return 0;
}
