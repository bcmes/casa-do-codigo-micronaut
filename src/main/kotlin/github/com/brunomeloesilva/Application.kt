package github.com.brunomeloesilva

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("github.com.brunomeloesilva")
		.start()
}
