# VEE wallet generator
This tool generates Waves addresses with 15 word seeds compatible with Waves Lite Client and Waves Full Node. The output is exported to a 'wallet.dat' for the Full Node and to a CSV file, 'addresses.csv', which contains the list of all generated addresses with seeds, private keys and public keys.


## Usage Java

```
$ java -jar walletgenerator.jar --help
VEE wallet generator 0.0.1
Usage: walletgenerator [options]

  -a, --append            append to existing wallet.dat / addresses.csv
  -c, --count <value>     number of addresses to generate
  -t, --testnet           generate testnet addresses
  -p, --password <value>  wallet password
  -f, --filter <value>    filter addresses with a specific pattern
  -s, --case-sensitive    case sensitive filtering
  -k, --seed <value>      set wallet seed for address recovery
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
scala> WalletGenerator.main(Array("--testnet", "--count", "3"))
------------------------------------------------------------------------------------------------------------------------------------------------------
IMPORTANT - COPY OR MEMORIZE THE SEED PHRASE BELOW FOR KEY RECOVERY!!!
seed         : dance gaze inquiry buddy census embrace report wall wolf flip grant injury middle mix split journey blade body
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 0
public key   : FjEJ8YkX8yeQ5Qs6jg8KsTHr7K9haaLEeydRRUvu32f2
private key  : 6xichuzHVhxNvDc3ssSevRGPZ9YT8ekP9dKViKbPgnBn
address      : 3NCrR4y11e1yPJjStEqxxcieTxXrYkzbQBR
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 1
public key   : ExAzuK7gpWpiJ8g8exVhzkUJP5wgs4jjPKmAHw5DntZq
private key  : G8Xk3oKLMvUATmwncjoEUkgQEFvtGX9R1E3w8sc2A1Te
address      : 3N9EkefnL5EY3urscR19Pq6cR4GyHChZer9
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 2
public key   : GwcKb3Td6RMBDZwTbrJCzUDFxquiNHwrXa9B8FVBNuCn
private key  : G6JjhkyN2U4LSErRdeTfYeppcFcXzzcrdvSz5AUh6gCH
address      : 3MwURWkoSDqhcEnCrAVSMXsE5n6gye48fmH
------------------------------------------------------------------------------------------------------------------------------------------------------

scala> WalletGenerator.main(Array("--testnet", "--count", "3", "--seed", "dance gaze inquiry buddy census embrace report wall wolf flip grant injury middle mix split journey blade body"))
------------------------------------------------------------------------------------------------------------------------------------------------------
IMPORTANT - COPY OR MEMORIZE THE SEED PHRASE BELOW FOR KEY RECOVERY!!!
seed         : dance gaze inquiry buddy census embrace report wall wolf flip grant injury middle mix split journey blade body
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 0
public key   : FjEJ8YkX8yeQ5Qs6jg8KsTHr7K9haaLEeydRRUvu32f2
private key  : 6xichuzHVhxNvDc3ssSevRGPZ9YT8ekP9dKViKbPgnBn
address      : 3NCrR4y11e1yPJjStEqxxcieTxXrYkzbQBR
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 1
public key   : ExAzuK7gpWpiJ8g8exVhzkUJP5wgs4jjPKmAHw5DntZq
private key  : G8Xk3oKLMvUATmwncjoEUkgQEFvtGX9R1E3w8sc2A1Te
address      : 3N9EkefnL5EY3urscR19Pq6cR4GyHChZer9
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 2
public key   : GwcKb3Td6RMBDZwTbrJCzUDFxquiNHwrXa9B8FVBNuCn
private key  : G6JjhkyN2U4LSErRdeTfYeppcFcXzzcrdvSz5AUh6gCH
address      : 3MwURWkoSDqhcEnCrAVSMXsE5n6gye48fmH
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

Recovery 10 addresses by input seed. Output to screen, wallet.dat (encrypted with 'mypassword') and addresses.csv
```
$ java -jar walletgenerator.jar -c 10 -p mypassword -k "stem extra father tail struggle dinner uphold sight canoe draw moon swim amused grab mule gadget bubble hub"
```
