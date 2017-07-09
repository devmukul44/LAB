// Sample: RSA Signature Scheme
//   Signature Scheme with Appendix

#include "stdafx.h"

#include "rsa.h"
#include "osrng.h"
#include "integer.h"
#include "sha.h"
#include "hex.h"
#include "filters.h"

int main(int argc, char* argv[])
{
    ///////////////////////////////////////
    // Quote of the Day
    //   Stephen Hawkins
    std::string message( "I think computer viruses should count as life. I think it\n" \
        " says something about human nature that the only form of\n" \
        " life we have created so far is purely destructive. We've\n" \
        " created life in our own image." );

    ///////////////////////////////////////
    // Pseudo Random Number Generator
    CryptoPP::AutoSeededRandomPool rng;

    ///////////////////////////////////////
    // Key Generation
    CryptoPP::InvertibleRSAFunction keys;
    keys.GenerateRandomWithKeySize( rng, 384 );

    ///////////////////////////////////////
    // Generated Parameters
    CryptoPP::Integer n = keys.GetModulus();
    CryptoPP::Integer p = keys.GetPrime1();
    CryptoPP::Integer q = keys.GetPrime2();
    CryptoPP::Integer d = keys.GetPrivateExponent();
    CryptoPP::Integer e = keys.GetPublicExponent();

    ///////////////////////////////////////
    // Dump
    std::cout << "RSA Parameters:" << std::endl;
    std::cout << " n: " << n << std::endl;
    std::cout << " p: " << p << std::endl;
    std::cout << " q: " << q << std::endl;
    std::cout << " d: " << d << std::endl;
    std::cout << " e: " << e << std::endl;
    std::cout << std::endl;

    ///////////////////////////////////////
    // Signature
    CryptoPP::RSASS<
        CryptoPP::PKCS1v15, CryptoPP::SHA
    >::Signer signer( keys );

    ///////////////////////////////////////
    // Dump
    std::cout << "Message:" << std::endl;
    std::cout << " " << message << std::endl;
    std::cout << std::endl;

    // Set up for SignMessage()
    byte* signature = new byte[ signer.MaxSignatureLength() ];
    if( NULL == signature ) { return -1; }

    // Sign...
    size_t length = signer.SignMessage( rng, (const byte*) message.c_str(),
        message.length(), signature );

    ///////////////////////////////////////
    // Signature Hex Encoding
    std::string encoded;
    CryptoPP::HexEncoder encoder( new CryptoPP::StringSink( encoded ),
        true /* Uppercase */, 2 /* Grouping */, ":" /* Separator */ );
    encoder.Put( signature, length );
    encoder.MessageEnd();

    ///////////////////////////////////////
    // Dump
    std::cout << "Signature:" << std::endl;
    std::cout << " " << encoded << std::endl;
    std::cout << std::endl;

    ///////////////////////////////////////
    // Verification
    CryptoPP::RSASS<
        CryptoPP::PKCS1v15, CryptoPP::SHA
    >::Verifier verifier( signer );

    bool result = verifier.VerifyMessage( (const byte*)message.c_str(),
        message.length(), signature, length );

    ///////////////////////////////////////
    // Verify Result
    if( true == result )
    {
        std::cout << "Message Verified" << std::endl;
    }
    else
    {
        std::cout << "Message Verification Failed" << std::endl;
    }

    ///////////////////////////////////////
    // Cleanup
    if( NULL != signature ) { delete[] signature; }

    return 0;
}

