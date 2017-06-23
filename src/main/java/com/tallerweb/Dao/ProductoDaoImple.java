package com.tallerweb.Dao;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.tallerweb.model.*;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import static com.googlecode.s2hibernate.struts2.plugin.util.HibernateSessionFactory.getSession;

/**
 * Created by gonza on 18/6/2017.
 */
public class ProductoDaoImple implements ProductoDao {

    @SessionTarget
    private Session session;

    @TransactionTarget
    private Transaction transaction;

    @Override
    public void addProducto(Producto p){
        session.save(p);
    }
    @Override
    public void editProducto(Integer id, Producto pAnt){

        Criteria p1 = session.createCriteria(Producto.class);

        Producto pEdit = new Producto();
        p1.add(Restrictions.eq("idProducto", id));

        pEdit = pAnt;

        session.update(pEdit);
    }

    @Override
    public List<Categoria> getCategorias(){

        Criteria c1 = getSession().createCriteria(Categoria.class);

        List<Categoria> categorias = c1.list();

        return categorias;
    }

    @Override
    public List<Talle>getTalle(){
        Criteria t1 = getSession().createCriteria(Talle.class);

        return t1.list();
    }
    @Override
    public List<Color>getColor(){

        Criteria col = getSession().createCriteria(Color.class);
        List<Color> colores = col.list();
        return colores;
    }
    @Override
    public  List<Producto>getProductos() {
        Criteria c1 = getSession().createCriteria(Producto.class);
        c1.add(Restrictions.eq("novedad", "S"));
        c1.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        return c1.list();
    }
    @Override
    public Color color(Integer id){

        Criteria col = getSession().createCriteria(Color.class);
        col.add(Restrictions.eq("idColor",id));
        col.setMaxResults(1);
        Color c = (Color)col.uniqueResult();
        return c;
    }
    @Override
    public Categoria categoria(Integer id){

        Criteria c1 = getSession().createCriteria(Categoria.class);
        c1.add(Restrictions.eq("idCategoria",id));
        c1.setMaxResults(1);
        Categoria cat = (Categoria)c1.uniqueResult();

        return cat;
    }

    @Override
    public Talle talle(Integer id){
        Criteria t1 = getSession().createCriteria(Talle.class);
        t1.add(Restrictions.eq("idTalle",id));
        t1.setMaxResults(1);
        Talle t = (Talle)t1.uniqueResult();
        return t;
    }

    @Override
    public Producto prodcuto(Long id){
        Criteria p1 = getSession().createCriteria(Producto.class);
        p1.add(Restrictions.eq("idProducto",id));
        p1.setMaxResults(1);
        Producto p = (Producto)p1.uniqueResult();
        return p;
    }

    @Override
    public  void agregarProductoCarrito(Producto p){
        session.update(p);
    }


    @Override
    public  List<Producto>getProductosM(){
        Criteria c1 = getSession().createCriteria(Producto.class);
        c1.add(Restrictions.like("genero","FEM%"));
        c1.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        return c1.list();
    }

    @Override
    public  List<Producto>getProductosH(){
        Criteria c1 = getSession().createCriteria(Producto.class);
        c1.add(Restrictions.like("genero","MAS%"));
        c1.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        return c1.list();
    }
}


