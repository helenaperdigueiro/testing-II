*** Settings ***
Library         SeleniumLibrary
Resource        Hurb.resource
Test Teardown   Close Browser

*** Test Case ***
Processo de compra de um pacote de viagens
    Dado que eu estou no site do Hurb
    Quando aceito os cookies do site
    # E busco por um pacote de viagens para "Buenos Aires"