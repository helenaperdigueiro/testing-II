*** Settings ***
Library         RequestsLibrary
Library         Collections
Resource        Poke.resource

*** Test Case ***
Validação da PokeAPI
    Verificação de Pokemons por cor
    Validação de Status Code da requisição