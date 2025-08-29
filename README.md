# Serialização de Aluno

Este projeto é uma aplicação Java console que demonstra como serializar e desserializar objetos usando a classe `ObjectOutputStream` e `ObjectInputStream`. O exemplo utiliza uma classe `Aluno` com diversos atributos, incluindo um campo `transient` para mostrar que ele não é salvo no arquivo.

## Integrantes da dupla:
- David Balzarini Pereira
- Sérgio Machado De Lima Filho

## Como executar

1. **Compilação:**  
   No terminal, navegue até a pasta do projeto e execute:
   ```
   javac -d bin src\project\Aluno.java src\project\Main.java
   ```

2. **Execução:**  
   Ainda na pasta do projeto, execute:
   ```
   java -cp bin project.Main
   ```

## Estrutura de pastas

```
serializacao/
│
├─ bin/
│   └─ project/
│       ├─ Aluno.class
│       └─ Main.class
├─ src/
│   └─ project/
│       ├─ Aluno.java
│       └─ Main.java
├─ aluno.ser
├─ alunos.iml
├─ README.md
├─ .idea/
│   ├─ .gitignore
│   ├─ misc.xml
│   └─ modules.xml
```

## Funcionamento

- Cria um objeto `Aluno` e o serializa para o arquivo `aluno.ser`.
- Desserializa o objeto e exibe seus dados.
- Altera o curso do aluno, serializa novamente e mostra o resultado.
- O campo `senhaPortal` é `transient` e não é salvo no arquivo.

---

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos - 4POA.