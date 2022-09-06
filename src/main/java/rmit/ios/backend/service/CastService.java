package rmit.ios.backend.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rmit.ios.backend.repository.CastRepository;

@Service
@AllArgsConstructor
public class CastService {
    @Autowired
    private CastRepository castRepository;
}
