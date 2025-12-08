package services;

import models.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import repository.PerfilRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public List<Perfil> findAll() {
        return perfilRepository.findAll();
    }


    public Perfil findById(Long id) {
        return perfilRepository.findById(id).orElse(null);
    }


    public Perfil save(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    public Perfil update(Long id, Perfil perfil) {
        Perfil existing = perfilRepository.findById(id).orElse(null);
        if (existing == null) return null;
        perfil.setId(id);
        return perfilRepository.save(perfil);
    }

    public void delete(Long id) {
        perfilRepository.deleteById(id);
    }
}
