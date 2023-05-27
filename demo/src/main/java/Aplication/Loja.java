package Aplication;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Cubo> cubos;
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;

    // Construtor
    public Loja() {
        this.cubos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    // Getters
    public List<Cubo> getCubos() {
        return cubos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    // CRUD para Cubo
    public void createCubo(Cubo cubo) {
        this.cubos.add(cubo);
    }

    public Cubo readCubo(int index) {
        return this.cubos.get(index);
    }

    public void updateCubo(int index, Cubo cubo) {
        this.cubos.set(index, cubo);
    }

    public void deleteCubo(int index) {
        this.cubos.remove(index);
    }

    // CRUD para Cliente
    public void createCliente(Cliente cliente) {
        if(!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
        }
    }

    public Cliente readCliente(Cliente cliente) {
        int index = this.clientes.indexOf(cliente);
        if(index != -1) {
            return this.clientes.get(index);
        }
        return null;
    }

    public void updateCliente(Cliente clienteOriginal, Cliente clienteModificado) {
        int index = this.clientes.indexOf(clienteOriginal);
        if(index != -1) {
            this.clientes.set(index, clienteModificado);
        }
    }

    public void deleteCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    // CRUD para Funcionario
    public void createFuncionario(Funcionario funcionario) {
        if(!this.funcionarios.contains(funcionario)) {
            this.funcionarios.add(funcionario);
        }
    }

    public Funcionario readFuncionario(Funcionario funcionario) {
        int index = this.funcionarios.indexOf(funcionario);
        if(index != -1) {
            return this.funcionarios.get(index);
        }
        return null;
    }

    public void updateFuncionario(Funcionario funcionarioOriginal, Funcionario funcionarioModificado) {
        int index = this.funcionarios.indexOf(funcionarioOriginal);
        if(index != -1) {
            this.funcionarios.set(index, funcionarioModificado);
        }
    }

    public void deleteFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }
}
