package ayds.dictionary.foxtrot.services;

import java.io.IOException;

public interface YandexService {
  String getMeaning(String term) throws IOException;
}
