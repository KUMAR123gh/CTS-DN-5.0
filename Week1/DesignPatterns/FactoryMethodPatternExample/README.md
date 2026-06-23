# Factory Method Pattern Example

## Objective
Implement the Factory Method Design Pattern to create different types of documents without exposing object creation logic to the client.

## Scenario
A document management system needs to create Word, PDF, and Excel documents. Instead of directly creating objects using the `new` keyword, factory classes are responsible for creating the appropriate document objects.

## Project Structure

src/
├── document/
│   ├── Document.java
│   ├── WordDocument.java
│   ├── PdfDocument.java
│   └── ExcelDocument.java
│
├── factory/
│   ├── DocumentFactory.java
│   ├── WordDocumentFactory.java
│   ├── PdfDocumentFactory.java
│   └── ExcelDocumentFactory.java
│
└── FactoryTest.java

## Sample Output

Opening Word Document...
Opening PDF Document...
Opening Excel Document...

## Conclusion

The Factory Method Pattern delegates object creation to factory classes, making the application flexible, maintainable, and easier to extend with new document types.