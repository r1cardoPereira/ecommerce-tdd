echo "Digite a tag"
read TAG

git tag $TAG
git push --tags

docker build -t r1cardopereira/ecomercetdd:$TAG
docker push r1cardopereira/ecomercetdd:$TAG