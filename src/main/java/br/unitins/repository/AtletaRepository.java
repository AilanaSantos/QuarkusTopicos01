package br.unitins.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.unitins.model.Atleta;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class AtletaRepository implements PanacheRepository<Atleta> {

    public Atleta findByNome(String nome) {
        return find("nome", nome).firstResult();
    }

    public List<Atleta> findByNomeList(String nome){
        return find("nome Like ?1", "%" + nome + "%").list();
    }
}