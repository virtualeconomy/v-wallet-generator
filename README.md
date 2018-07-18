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
```
scala> WalletGenerator.main(Array("--testnet", "--count", "5"))
------------------------------------------------------------------------------------------------------------------------------------------------------
IMPORTANT - COPY OR MEMORIZE THE SEED PHRASE BELOW FOR KEY RECOVERY!!!
seed         : stem extra father tail struggle dinner uphold sight canoe draw moon swim amused grab mule gadget bubble hub
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 1
public key   : 4bSPXmtHwDgJnJ6M3cq5yucTeTq6yLsHhK6kB8GEuDCk
private key  : HiQF2DTBVZduXNMvRBYbjgjkW26nof5vhdBUuvV4xR35
address      : 3NBPSs3sggg8px7s856JdXcSM4ZDiq5zbMv
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 2
public key   : Ffr2sAXe1f63tQn26UTgDW3CywwUfZWXfZxUu1rGhdGS
private key  : HAGmPmj1MXYWvTNufV1tBtr4PAuBDizq8AZqFuPk6Vhe
address      : 3MyWVp3GiY4FcVPBiSn3x6pNQrDW5WsGKhf
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 3
public key   : 9cW13sEBGLb9xNQcyRbDk9VcvutnbSQTbgC1Z6mnJoSc
private key  : GevXSAaZ56BECDXZGvENEKU2J9vkCjZeEMpJ4hid6CVx
address      : 3N83RTfjCuXpXFSkXzMRzqFCSjzggJW7BGN
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 4
public key   : GEYM4u8YPkFFd4eD4EALXcWv5J84b3zeMKpbNojEZfTV
private key  : bcCeecC65MT3eVomYwYr12qVrzbnRmLQiPBPLGBWEZL
address      : 3Mw5Bf5W4JcDWCsxMdDX44feva3eoj3yvKS
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 5
public key   : GZ7R3avLPwAAe7dQ9hbCUAd4pivpfS7F6sUV7mz5ky9U
private key  : CN6ygmDqCE2ZhvLi9TVxsdWJpN9hL8NdcR3hEHWvKaEi
address      : 3N2Ebie6iPf4Lu1eMfjL9FzU2SpsJ5GQtkr
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

