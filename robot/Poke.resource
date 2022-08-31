*** Variables ***
${HOST}                                 https://pokeapi.co/api/v2/pokemon-color/

*** Keywords ***
Verificação de Pokemons por cor
    Verificar cor  red



Verificar cor
    [Arguments]                                             ${COR}
    Create Session      PokeAPI                             ${HOST}${COR}
    ${RESPOSTA}=        GET On Session      PokeAPI         ${HOST}${COR}
    Set Test Variable   ${RESPOSTA}
    Set Test Variable   ${COR}

Confere status code
    [Arguments]                     ${STATUS}
    Set Test Variable               ${RESPOSTA}
    Should Be Equal As Strings      ${RESPOSTA.status_code}     ${STATUS}