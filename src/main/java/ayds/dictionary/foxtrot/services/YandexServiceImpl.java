package ayds.dictionary.foxtrot.services;

import ayds.dictionary.foxtrot.parsers.ParserFromXML;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.Response;
import java.io.IOException;

class YandexServiceImpl implements YandexService {

  private final String urlAPI = "https://translate.yandex.net/api/v1.5/tr/";
  private YandexAPI yandexAPI;

  YandexServiceImpl() {
    Retrofit retrofit = new Retrofit.Builder()
    .baseUrl(urlAPI)
    .addConverterFactory(ScalarsConverterFactory.create())
    .build();
    yandexAPI = retrofit.create(YandexAPI.class);
  }

  @Override public String getMeaning(String term) throws IOException {
      String meaning = getResponse(term).body();
      return ParserFromXML.getInstance().format(meaning);
  }

  private Response<String> getResponse(String term) throws IOException {
    Response<String> callResponse;
    callResponse = yandexAPI.getTerm(term).execute();
    return callResponse;
  }

}
