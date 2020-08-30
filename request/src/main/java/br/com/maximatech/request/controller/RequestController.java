package br.com.maximatech.request.controller;

import br.com.maximatech.request.model.RequestModel;
import br.com.maximatech.request.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin
@RestController
public class RequestController {

    private RequestRepository requestRepository;

    @Autowired
    public RequestController (RequestRepository requestRepository) { this.requestRepository = requestRepository; }

    @GetMapping("/request")
    Iterable<RequestModel> all(@RequestParam int page, @RequestParam int size) {
        return requestRepository.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/request/{id}")
    RequestModel userById(@PathVariable Long id) {
        return requestRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/request")
    RequestModel save(@RequestBody RequestModel request) { return requestRepository.save(request); }
}
