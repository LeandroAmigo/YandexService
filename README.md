# YandexService
 `YandexService` es una libreria Java que encapsula el servicio de traducciones ENG-ESP de Yandex.
 El tipo de dato utilizado es String.
 
 
## Uso
```java
String term = "hello world";
YandexService service = ServiceModule.getInstance().getRemoteSource();
String meaning = service.getMeaning(term);
// meaning es la respuesta con la correspondiente traduccion a español
```