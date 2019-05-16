package com.gable.estudo.controller;

import com.gable.estudo.exception.ResourceNotFoundException;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "Employee Management System", description = "Operations pertaining to employee in Employee Management System")
public class Hello {

    @ApiOperation(value = "View a list of available employees", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 201, message = "Created")
    })

    @GetMapping("/hello")
    public Map<String, Object> index() {
        return Collections.singletonMap("message", "Hello World");
    }

    @ApiOperation(value = "Get an employee by Id")
    @GetMapping("/hello/{nome}/{sobreNome}")
    public Map<String, Object> getEmployeeById(
            @ApiParam(value = "Employee id from which employee object will retrieve", required = true)
            @PathVariable(value = "nome") String nome,
            @ApiParam(value = "Employee id from which employee object will retrieve", required = true)
            @PathVariable(value = "sobreNome") String sobreNome) throws ResourceNotFoundException {
        return Collections.singletonMap("message", "Hello World " + nome + " " + sobreNome);
    }

    @GetMapping("/teste")
    public ResponseEntity sendViaResponseEntity() throws Exception {
        throw new Exception("Recurso nao disponível");
    }
}
