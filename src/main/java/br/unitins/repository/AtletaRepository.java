package br.unitins.repository;

import javax.enterprise.context.ApplicationScoped;

import br.unitins.model.Atleta;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class AtletaRepository implements PanacheRepository<Atleta> {

    public Atleta findByNome(String nome) {
        return find("nome", nome).firstResult();
    }

}