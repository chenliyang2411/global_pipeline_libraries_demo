#!groovy
def call(Object obj) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    def object = obj[1].name;
    print "Hello, ${object}."
}


static void main(String[] args) {
    new sayHello().call([[name:"abc", age:10], [name:"abc2", age:15]]);
}



