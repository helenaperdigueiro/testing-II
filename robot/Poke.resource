*** Variables ***
${HOST}                                 https://pokeapi.co/api/v2/pokemon-color/

*** Keywords ***
Consulta de Pokemons por nome cor
    Verificar nome cor           red
    Confere status code     200

Consulta de Pokemons por id cor
    Verificar cor           8
    Confere name cor     red

Verificar nome cor
    [Arguments]                                             ${COR}
    Create Session      pokeapi                             ${HOST}${COR}
    ${RESPOSTA}=        GET On Session      pokeapi         ${HOST}${COR}
    Set Test Variable   ${RESPOSTA}
    # Set Test Variable   ${COR}

Confere status code
    [Arguments]                     ${STATUS}
    # Set Test Variable               ${RESPOSTA}
    Should Be Equal As Strings      ${RESPOSTA.status_code}     ${STATUS}

Verificar id cor
   [Arguments]  ${ID}
   Create Session    pokeid    ${HOST}${ID}
   ${RESPOSTA}=  GET On Session  pokid  ${HOST}${ID}
   Set Test Variable    ${COR}

Confere name cor
    [Arguments]                     ${NAME}
    Should Be Equal As Strings      ${RESPOSTA.name}     ${NAME}