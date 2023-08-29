package umg.analisis.sistemas.sistemavotaciones.clients;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import umg.analisis.sistemas.sistemavotaciones.dtos.ApiTseDto;

@Service
public class ApiTse {

    private final RestTemplate restTemplate;

    public ApiTse() {
        this.restTemplate = new RestTemplate();
    }

    public ApiTseDto consumeApiTse(String apiUrl) {
        return restTemplate.getForObject(apiUrl, ApiTseDto.class);
    }
}
