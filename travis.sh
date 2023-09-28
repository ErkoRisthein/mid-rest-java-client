#!/bin/bash

# Fail on first error
set -e

echo "Is pull request: $TRAVIS_PULL_REQUEST"
echo "Tag:             $TRAVIS_TAG"
echo "JDK version:     $TRAVIS_JDK_VERSION"

VERSION_REGEX='^([0-9]+\.){1,3}([0-9]+)$'

if [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_TAG" != "" ] && ![ "$TRAVIS_TAG" =~ $VERSION_REGEX ]; then
  echo "error: invalid version number. Version number must only contain numbers (and some dots in between)."
  exit 1
elif [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_TAG" != "" ]; then
  echo "Starting to publish"
  ./publish.sh
  echo "Finished"
elif [ "$TRAVIS_JDK_VERSION" == "openjdk17" ]; then
  ./mvnw test
  ./mvnw org.owasp:dependency-check-maven:check
  ./mvnw spotbugs:check
else
  ./mvnw test
fi
