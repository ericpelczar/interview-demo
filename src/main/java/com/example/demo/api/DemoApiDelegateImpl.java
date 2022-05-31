package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.demo.model.HelloWorld;

@Component
class DemoApiDelegateImpl implements DemoApiDelegate {

    @Override
    public ResponseEntity<HelloWorld> helloWorld() {
        HelloWorld helloWorld = new HelloWorld().message(HelloWorld.MessageEnum.HELLO_WORLD);
        return ResponseEntity.ok(helloWorld);
    }
}
