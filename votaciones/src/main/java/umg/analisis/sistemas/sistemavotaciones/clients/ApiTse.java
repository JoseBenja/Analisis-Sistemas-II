package umg.analisis.sistemas.sistemavotaciones.clients;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiTse {

    private final RestTemplate restTemplate;

    public ApiTse() {
        this.restTemplate = new RestTemplate();
    }

    public Object consumeApiTse(String apiUrl) {
        return restTemplate.getForObject(apiUrl, Object.class);
    }
}
