## docker安装consul
* `docker pull consul`

## docker启动consul
* `docker run -d -p 8500:8500 -v /data/consul:/consul/data -e CONSUL_BIND_INTERFACE='eth0' --name=consul_server_1 consul:latest agent -server -bootstrap -ui -node=1 -client='0.0.0.0'`

## 安装git2consul
* `npm install -g git2consul`

## 启动git2consul
* 指定host和port   
`git2consul --config-file git2consul.json -e localhost -p 8500`
