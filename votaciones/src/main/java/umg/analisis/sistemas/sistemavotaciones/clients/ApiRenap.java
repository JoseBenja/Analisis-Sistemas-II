package umg.analisis.sistemas.sistemavotaciones.clients;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiRenap {

    private final RestTemplate restTemplate;

    public ApiRenap() {
        this.restTemplate = new RestTemplate();
    }

    public Object consumeApiRenap(String apiUrl) {
        return restTemplate.getForObject(apiUrl, Object.class);
    }
}
