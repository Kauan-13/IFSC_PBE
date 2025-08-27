package ads.pbe.projetobanco.repositories;

import ads.pbe.projetobanco.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findFirstByNome(String nome);
}
