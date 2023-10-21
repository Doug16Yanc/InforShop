package domain

class Produto {
    private var codigo : Int = 0
    private var nome : String = ""
    private var preco : Double = 0.0

    constructor(codigo : Int, nome : String, preco : Double){
        this.codigo = codigo
        this.nome = nome
        this.preco = preco
    }
    fun getCodigo() : Int ? {
        return codigo
    }
    fun setCodigo(codigo : Int){
        this.codigo = codigo;
    }
    fun getNome() : String?{
        return nome
    }
    fun setNome(nome : String){
        this.nome = nome
    }
    fun getPreco() : Double ? {
        return preco
    }
    fun setPreco(preco : Double){
        this.preco = preco
    }
}