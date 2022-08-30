*** Variables ***
${SITE}                     https://www.hurb.com/br
${NAVEGADOR}                Chrome
${BOTAO_COOKIES}            xpath=//*[@id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"]
${BOTAO_PACOTES}            xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[1]/div/div/button[2]
${INPUT_DESTINO}            xpath=//*[@id="destination-input"]
${TEXTO_DESTINO}            Buenos Aires
${BOTAO_PESQUISAR}            xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[2]/button


*** Keywords ***
Dado que eu estou no site do Hurb
    Open Browser                        ${SITE}    ${NAVEGADOR}
    Maximize Browser Window

Quando aceito os cookies do site
    Sleep                               5
    Wait and Click                      ${BOTAO_COOKIES}

E busco por um pacote de viagens para "Buenos Aires"
    Wait and Click                      ${BOTAO_PACOTES}
    Wait and Input Text                 ${INPUT_DESTINO}        ${INPUT_DESTINO}
    Wait and Click                      ${BOTAO_PESQUISAR}





Wait and Input Text
    [Arguments]                         ${ELEMENTO}
    Wait Until Element is Visible       ${ELEMENTO}
    Input Text                          ${ELEMENTO}

Wait and Click
    [Arguments]                         ${ELEMENTO}     ${TEXTO}
    Wait Until Element is Visible       ${ELEMENTO}
    Wait Until Element is Enabled       ${ELEMENTO}
    Click Element                       ${ELEMENTO}     ${TEXTO}