package umg.analisis.sistemas.sistemavotaciones.clients;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import umg.analisis.sistemas.sistemavotaciones.dtos.ApiRenapDto;

@Service
public class ApiRenap {

    private final RestTemplate restTemplate;

    public ApiRenap() {
        this.restTemplate = new RestTemplate();
    }

    public ApiRenapDto consumeApiRenap(String apiUrl) {
        return restTemplate.getForObject(apiUrl, ApiRenapDto.class);
    }
}
