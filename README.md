# VEE wallet generator
This tool generates Waves addresses with 15 word seeds compatible with Waves Lite Client and Waves Full Node. The output is exported to a 'wallet.dat' for the Full Node and to a CSV file, 'addresses.csv', which contains the list of all generated addresses with seeds, private keys and public keys.


## Usage Java

```
$ java -jar walletgenerator.jar --help
VEE wallet generator 0.0.1
Usage: walletgenerator [options]

  -a, --append            [TODO] append to existing wallet.dat / addresses.csv
  -c, --count <value>     number of addresses to generate
  -t, --testnet           generate testnet addresses
  -p, --password <value>  [TODO] wallet password
  -f, --filter <value>    filter addresses with a specific pattern
  -s, --case-sensitive    case sensitive filtering
  --help                  prints this help message
```	

## Usage Sbt Console

```
$ sbt console
scala> WalletGenerator.main(Array("--testnet", "--count", "10"))
```

## Examples

Generate testnet addresses. Output to screen, wallet.dat and addresses.csv.
Case-sensitive filtering with word 'VEE' in the addresses.
```
scala> WalletGenerator.main(Array("--testnet", "--count", "50000", "--filter", "VEE", "--case-sensitive"))
------------------------------------------------------------------------------------------------------------------------------------------------------
IMPORTANT - COPY OR MEMORIZE THE SEED PHRASE BELOW FOR KEY RECOVERY!!!
seed         : amazing habit method reflect ahead ignore crop hover neither dial write draw evil butter camp lonely dwarf guilt
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 1
public key   : J1Uz7FGLCpKCVmwSS7RPb2iPXY5Uv3y1cDBgYtcSN73i
private key  : 8ZsCd3QGGmurxB5yvLB1UHXZwnrVHkGZZyRE4y5hPjC7
address      : 3N1cVnHk1VEEz5kZD6UTkFT1HF9VDKHdWYW
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 2
public key   : GgE7pFbffzoNJESA9SLTBhwy7G2cqLRgLNXZN6F2QCe3
private key  : CKnVA2vBUMFor8hLyz5SaY83gJNW3ff9UHCAAeQx6B3o
address      : 3MuVjDRsBUDVLwF28XTpb2PVVDVEEAUFWb7
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 3
public key   : DZpR3V6x18kaD5hFHdcf4Ln3ycmmoimCcfAz98RUprtQ
private key  : Bnh7QzXFrDWNo2RAJpgR8FLzeMqPXhTs3BY97tDXXm6h
address      : 3MsN9mnNA5KXr1R5VEEnMYy5KbRjYFScwig
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 4
public key   : 86DxvsHXThxVP3Nz8NDba4k3HCnSDKzMRXgYqKaBDp6Z
private key  : AiReVo3AwLnkeqtpbxt49DdjpZdNo7PprjuBBcXX4rHS
address      : 3NCKmqo6QRmSVEEHDctbxWMcoGfeHyayCGS
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 5
public key   : 2bzVBm3EDeKUG5y7kfmMms4oLkZfNGgxXfMtncd2tmwv
private key  : F1FTfFjYnrudXLhx6CWYFF9fyXuV2Wwc5xGjfaqhQbZG
address      : 3N1Gpt1aCVEE1ygrnxwVQuBmu9XhwpgNaTP
------------------------------------------------------------------------------------------------------------------------------------------------------
```

Generate 100 mainnet addresses. Output to screen, wallet.dat (encrypted with 'mypassword') and addresses.csv
```
$ java -jar walletgenerator.jar -c 100 -p mypassword  
```

Generate 100 addresses. Output to screen, append to existing wallet.dat (encrypted with 'mypassword') and addresses.csv
```
$ java -jar walletgenerator.jar -a -c 100 -p mypassword  
```

