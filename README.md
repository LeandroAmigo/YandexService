# YandexService
 `YandexService` es una libreria Java que encapsula el servicio de traducciones ENG-ESP de Yandex.
 El tipo de dato utilizado es String.
 
 
## Usage
```java
String term = "hello world";
Service service = ServiceModule.getInstance().getRemoteSource();
String meaning = service.getMeaning(term);
// meaning es la respuesta con la correspondiente traduccion a español
```