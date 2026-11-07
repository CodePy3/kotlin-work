# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
classDiagram
    class Customer {
        +String name
        +String address
        +placeOrder()
    }
    class Order {
        + Int orderNumber
        + Date datePlaced
        
    }
    class OrderItem {
        + String name
        + String description
    }
    Customer --> Order : places
    Order --> OrderItem : includes

```


[mer]: https://mermaid.js.org/
