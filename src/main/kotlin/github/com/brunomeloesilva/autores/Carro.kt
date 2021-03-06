package github.com.brunomeloesilva.autores

import io.micronaut.core.annotation.Introspected
import javax.persistence.*
import javax.validation.constraints.NotBlank

//@Introspected
@Entity
data class Carro(
    @field:NotBlank @Column(nullable = false) val modelo: String?,
    @field:NotBlank @field:Placa @Column(nullable = false, unique = true) val placa: String?
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}
