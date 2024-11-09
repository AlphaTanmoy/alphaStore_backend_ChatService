package com.AlphaStore.ChatService

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class ChatServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(ChatServiceApplication::class.java, *args)
}
