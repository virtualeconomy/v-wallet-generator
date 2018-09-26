# VEE wallet generator
This tool generates VEE wallet file with 15-word seed phrase. The output is exported to 'wallet.dat' which is compatible with [VEE wallet format specification 1.0](https://github.com/excelsia/rfcs/blob/master/text/0001-wallet-format-specification.md) and can be used with full node,  as well as a CSV file 'addresses.csv', which contains the list of all generated addresses with seeds, private keys and public keys.


## Usage Java

```
$ java -jar walletgenerator.jar --help
VEE Wallet Generator 0.1.0
Usage: walletgenerator [options]

  -a, --append            append to existing wallet file
  -c, --count <value>     number of addresses to generate
  -t, --testnet           generate testnet addresses
  -p, --password <value>  wallet password
  -f, --filter <value>    filter addresses with a specific pattern
  -s, --case-sensitive    case sensitive filtering
  -k, --seed <value>      set wallet seed for account recovery
  -d, --decrypt           decrypt and print existing wallet file
  -v, --csv               print keys to csv file also
  --help                  prints this help message
```	

## Usage Sbt

```
$ sbt
sbt:walletgenerator> run --testnet
```

## Usage Sbt Console

```
$ sbt console
scala> WalletGenerator.main(Array("--testnet", "--count", "10"))
```

## Examples

Generate testnet addresses. Output to screen, wallet.dat and addresses.csv (optional).
```
sbt:walletgenerator> run --testnet --count 3
[info] Running WalletGenerator --testnet --count 3
------------------------------------------------------------------------------------------------------------------------------------------------------
IMPORTANT - COPY OR MEMORIZE THE SEED PHRASE BELOW FOR KEY RECOVERY!!!
seed         : welcome scheme bargain boring enable include slogan announce girl rough mention thought ski script vague
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 0
address      : AU347Rei2RW5MiQqvj5kfxx8WAz9zv1oTWx
public key   : C7yKso5wS8G4JS9sHwBZ52UBQwJsoSCeJU77njYcBL3o
private key  : 26HceeeMgFFaTE1g3D8K3LXwZ8js5z2c4wLjE3BZpWX4
account seed : JBRfQrMGW3icaPwQaBpYfqFzv33GhCmtvM5KX6X1s7ux
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 1
address      : AUCmiawWqFGKcrtCvqtyfL7sG5koEgWewQi
public key   : wa1UaGrtXDeFp2gZf26kZfoR3F3nnsrKGcJH3GRkmuv
private key  : AAvMzq7PZLYSwSwHfEDE6rLr6qSRTwmZSF3V5oPxhAUU
account seed : YQv859RZvuqaTwjs4kSZCA3WymWYEo7FcG8HiuuKMtr
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 2
address      : AU9iHwZKDejoJYk46YRe5jiHp5ENwTT4vYG
public key   : 47CYYUrgUESuw1amJEmtHcMVvMhabW6vt8cPJE5ZKz5m
private key  : DS1NNXwnez3RBjiHKbG2PrdKPTxi1j13YujSQYKh2drJ
account seed : D1SMMbPYV9f4g11qJScdz6JCe6mxfdppa7EvCqq9LNFZ
------------------------------------------------------------------------------------------------------------------------------------------------------
```

Recover wallet with a seed phrase.
```
sbt:walletgenerator> run --testnet --count 3 --seed "welcome scheme bargain boring enable include slogan announce girl rough mention thought ski script vague"
```

Decrypt and print JSON wallet (with empty password).
```
sbt:walletgenerator> run --decrypt
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
