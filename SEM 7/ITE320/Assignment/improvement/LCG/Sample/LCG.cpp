// sample.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

// Runtime Library Includes
#include <string>
#include <iostream>
#include <iomanip>

// Crypto++ Include
#include "osrng.h" // PRNG

int main(int argc, char* argv[])
{   
    // Scratch Area
    //   Use as seed to the LCG
    const unsigned int BLOCKSIZE = 16 * 8;
    byte pcbScratch[ BLOCKSIZE ];

    std::cout << "Seed:" << BLOCKSIZE << std::endl << std::endl;
    
    // 1st LCG
    CryptoPP::LC_RNG lcg1( BLOCKSIZE /*32 bit word */);
    lcg1.GenerateBlock( pcbScratch, BLOCKSIZE );

    // Output
    std::cout << "The 1st LCG produced:" << std::endl;
    for( unsigned int i = 0; i < BLOCKSIZE; i++ )
    {
        std::cout << "0x" << std::setbase(16) << std::setw(2) << std::setfill('0');
        std::cout << static_cast<unsigned int>( pcbScratch[ i ] ) << " ";
    }
    std::cout << std::endl;
    
    // @nd LCG
    CryptoPP::LC_RNG lcg2( BLOCKSIZE /*32 bit word */);
    lcg2.GenerateBlock( pcbScratch, BLOCKSIZE );

    // Output
    std::cout << "The 2nd LCG produced:" << std::endl;
    for( unsigned int i = 0; i < BLOCKSIZE; i++ )
    {
        std::cout << "0x" << std::setbase(16) << std::setw(2) << std::setfill('0');
        std::cout << static_cast<unsigned int>( pcbScratch[ i ] ) << " ";
    }
    std::cout << std::endl;    

    return 0;
}
