package co.edu.uniquindio.unicine.servicios;

import co.edu.uniquindio.unicine.entidades.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface AdminServicio {

    Ciudad crearCiudad(Ciudad ciudad);

    Ciudad obtenerCiudad (Integer codigo) throws Exception;

    Pelicula crearPelicula(Pelicula pelicula);

    Pelicula ActualizarPelicula(Pelicula pelicula) throws Exception;

    void eliminarPelicula(Integer codigo) throws Exception;

    List<Pelicula> listarPeliculas();

    Pelicula obtenerPelicula(Integer codigo) throws Exception;

    Cupon crearCupon(Cupon cupon);

    Cupon actualizarCupon(Cupon cupon) throws Exception;

    void eliminarCupon(Integer codigo) throws Exception;

    List<Cupon> listarCupones();

    Cupon obtenerCupon(Integer codigo) throws Exception ;

    Confiteria crearConfiteria(Confiteria confiteria);

    Confiteria actualizarConfiteria(Confiteria confiteria) throws Exception;

    void eliminarConfiteria(Integer codigo) throws Exception;

    List<Confiteria> listarConfiteria();

    Confiteria obtenerConfiteria(Integer codigo) throws Exception;

    AdministradorTeatro crearAdminTeatro(AdministradorTeatro administradorTeatro);

    AdministradorTeatro actualizarAdminTeatro(AdministradorTeatro administradorTeatro) throws Exception;

    void eliminarAdminTeatro(Integer codigo) throws Exception;

    List<AdministradorTeatro> listarAdminsTeatro();

    AdministradorTeatro obtenerAdminTeatro(Integer codigo) throws Exception;

}
