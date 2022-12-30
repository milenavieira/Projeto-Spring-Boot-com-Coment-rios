package br.com.cod3r.exerciciossb.model.repositories;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {


    Iterable<Produto> findAll(Pageable page);

    Iterable<Produto> findByNomeContaining(String parteNome);

    //findByNomeContaining
    //findByNomeIsContaining
    //findByNomeContains
    //findByNomeStartsWith
    //findByNomeEndsWith
    //findByNomeNotContaining

    //Também é possível criar a sua query, conforme sua necessidade especifica:
    //@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    //public Iterable<Produto> searchByNameLike(@Param("nome") String nome


}
