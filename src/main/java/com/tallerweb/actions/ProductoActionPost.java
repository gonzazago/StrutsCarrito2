package com.tallerweb.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tallerweb.Servicios.ProductoServicios;
import com.tallerweb.Servicios.ProductosServiciosImple;
import com.tallerweb.model.*;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by gonza on 18/6/2017.
 */
@Namespace(value = "/")
@ParentPackage("hibernate-default")
@InterceptorRef("basicStackHibernate")
@Action(value="VerificarProducto", results = {
        @Result(name = SUCCESS, type = "redirect", location = "Home"),
        @Result(name = ERROR, type = "redirect", location = "/jsp/ProductoAlta.jsp"),
        @Result(name = "input",location = "/jsp/ProductoAlta.jsp")

})
@InterceptorRefs(value =
        {
                @InterceptorRef(value = "fileUpload", params =
                        {
                                "maximumSize", "2097152", "allowedTypes","image/jpg,"
                                                                        + "image/jpeg,"
                                                                        + "image/gif,"
                                                                        + "image/png,"
                        }),
                @InterceptorRef(value = "defaultStack")
        })
public class ProductoActionPost extends ActionSupport implements ServletRequestAware{

    private ProductoServicios pServ = new ProductosServiciosImple();

    private Long idProducto;
    private String nombreProducto;
    private String descripcion;
    /*private Integer categoria;
    private Integer color;
    private Integer talle;*/
    private Integer categoria;
    private Integer color;
    private Integer talle;
    private String genero;
    private Float precio;
    private String novedad;
    private Integer stock;
    private String nombreimagen;


    /*Parametros para subir la Imagen*/
    private File userImage;
    private String userImageContentType;
    private String userImageFileName;

    private HttpServletRequest servletRequest;

    @Override
    public String execute() throws Exception{
         try {
                String filePath = servletRequest.getSession().getServletContext().getRealPath("/images/productos");

             System.out.println("FilePatch: " + filePath);
             System.out.println("Genero: " + genero);
                File fileToCreate = new File(filePath, this.userImageFileName);
                FileUtils.copyFile(this.userImage, fileToCreate);
                nombreimagen = "images/productos/"+userImageFileName;
                Color col = pServ.buscarColor(color);
                Talle tlle = pServ.buscarTalle(talle);
                Categoria cat = pServ.buscarCategoria(categoria);


                Producto producto = new Producto(idProducto,nombreProducto,descripcion,cat,col,tlle,precio,nombreimagen,novedad,stock,genero);

            pServ.guardarProducto(producto);

        }catch (IOException e){
            e.printStackTrace();
            return ERROR;
        }

        return SUCCESS;
    }



    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getTalle() {
        return talle;
    }

    public void setTalle(Integer talle) {
        this.talle = talle;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getNombreimagen() {
        return nombreimagen;
    }

    public void setNombreimagen(String nombreimagen) {
        this.nombreimagen = nombreimagen;
    }

    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public File getUserImage() {
        return userImage;
    }

    public void setUserImage(File userImage) {
        this.userImage = userImage;
    }

    public String getUserImageContentType() {
        return userImageContentType;
    }

    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }

    public String getUserImageFileName() {
        return userImageFileName;
    }

    public void setUserImageFileName(String userImageFileName) {
        this.userImageFileName = userImageFileName;
    }

    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;

    }
}
