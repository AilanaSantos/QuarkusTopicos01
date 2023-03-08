package br.unitins.resource;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.unitins.model.Atleta;
import br.unitins.repository.AtletaRepository;


@Path("/Inscricao")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AtletaResource {

    @Inject
    private AtletaRepository repository;

    @GET
    @Path("/todos")
    public List<Atleta> getall() {

        return repository.findAll().list();
    }

    @POST
    @Transactional
    public Atleta inserir(Atleta atleta) {

        repository.persist(atleta);

        return atleta;
    }

    // atualiza tudo
    @PUT
    @Path("/{id}")
    @Transactional
    public Atleta atualizar(@PathParam("id") Long id, Atleta atleta) {
        Atleta encontrarid = repository.findById(id);
        encontrarid.setNome(atleta.getNome());
        encontrarid.setIdade(atleta.getIdade());
        encontrarid.setPeso(atleta.getPeso());
        encontrarid.setAltura(atleta.getAltura());
        encontrarid.setModalidades(atleta.getModalidades());

        return encontrarid;
    }

    @GET
    @Path("/{id}")
    public Atleta buscarid(@PathParam("id") Long id) {
        return repository.findById(id);
    }

    @PATCH
    @Path("/{id}")
    @Transactional
    public Atleta atualizarParcial(@PathParam("id") Long id, Atleta atleta) {
        Atleta encontrarid = repository.findById(id);
        encontrarid.setNome(atleta.getNome());
        encontrarid.setIdade(atleta.getIdade());
        encontrarid.setPeso(atleta.getPeso());
        encontrarid.setAltura(atleta.getAltura());
        encontrarid.setModalidades(atleta.getModalidades());

        return encontrarid;
    }

    // deletar
    @DELETE
    @Path("/{nome}")
    @Transactional
    public Atleta deletar(@PathParam("nome") String nome) {
        Atleta encontrarid = repository.findByNome(nome);
        repository.delete(encontrarid);
        return encontrarid;
    }

    public Atleta pesquisarPorNome() {
        return null;

    }
    
    // pesquisa nome
    @GET
    @Path("/searchList/{modelo}")
    public List<Atleta> searchList(@PathParam("nome") String nome){
        return repository.findByNomeList(nome);
    }

}