*** Settings ***
Library         RequestsLibrary
Library         Collections
Resource        Poke.resource

*** Test Case ***
Validação da PokeAPI
    Consulta de Pokemons por nome cor
    Consulta de Pokemons por id cor