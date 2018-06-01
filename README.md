# YandexService
 `YandexService` es una libreria Java que encapsula el servicio de traducciones ENG-ESP de Yandex.
 El tipo de dato utilizado es String.
 El formato de las respuestas de salida es XML.
 
 
## Usage
	```java
	String term = "hello world";
	Service service = ServiceModule.getInstance().getRemoteSource();
	String meaning = service.getMeaning(term);
	// meaning es una respuesta en XML con la correspondiente traduccion a español
	```