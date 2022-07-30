package br.com.dio.jwt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table( name = "tab_user" )
public class User
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_user" )
    private Integer id;
    @Column( length = 50, nullable = false )
    private String name;
    @Column( length = 20, nullable = false )
    private String username;
    @Column( length = 100, nullable = false )
    private String password;
    @ElementCollection( fetch = FetchType.EAGER )
    @CollectionTable( name = "tab_user_roles", joinColumns = @JoinColumn( name = "user_id" ) )
    @Column( name = "role_id" )
    private List<String> roles = new ArrayList<>();

    public Integer getId()
    {
        return id;
    }

    public void setId(
        final Integer id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(
        final String name )
    {
        this.name = name;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(
        final String username )
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(
        final String password )
    {
        this.password = password;
    }

    public List<String> getRoles()
    {
        return roles;
    }

    public void setRoles(
        final List<String> roles )
    {
        this.roles = roles;
    }
}