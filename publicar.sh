#!/bin/bash

LOCAL=~/.ivy2/local/br.com.infra/infra-core_2.12

clear

if [ -d $LOCAL ]; then
  echo "removendo repositorio local: $LOCAL"
  rm -rf $LOCAL
fi

if [ -d target ]; then
  echo "removendo pasta target"
  rm -rf target
fi

echo "publicando..."
./sbt clean compile publishLocal

echo "ok!!"
