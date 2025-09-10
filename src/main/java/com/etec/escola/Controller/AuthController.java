package com.etec.escola.Controller;


import com.etec.escola.Models.Usuario;
import com.etec.escola.Service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*") //permite acesso do browser
public class AuthController {

    private final UsuarioService service;

    public AuthController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario usuario){
        return service.cadastrarNovoUsuario(usuario);
    }

    @PostMapping("/login")
    public String login(Usuario usuario){
        Usuario user = service.fazerLogin(usuario.getUsername(), usuario.getSenha());
        if (user != null){
            return "Login realizado com sucesso"+ user.getUsername();
        }
        return "Usuario ou senha inválidos";
    }

}
