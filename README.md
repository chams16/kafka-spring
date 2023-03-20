# Kafka with Spring
## After learning the theorical concept of the Kafka the Broker, Topics, Zookeeper, The partitions 
## I try to connect application that contains two service beetween each other using Kafka
# Producer
## An Order service that is the producer that send the order to another service to proceed the payment
# Consumer
## A pyment service that receive the order from the producer service and do all the logic and buissness to proceed the payment
# Topic
## Both consumer and producer connect to a Topic called Payment
