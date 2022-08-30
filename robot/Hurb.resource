*** Variables ***
${SITE}                     https://www.hurb.com/br
${NAVEGADOR}                Chrome
${BOTAO_COOKIES}            xpath=//*[@id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"]

*** Keywords ***
Dado que eu estou no site do Hurb
    Open Browser                        ${SITE}    ${NAVEGADOR}
    Maximize Browser Window

Quando aceito os cookies do site
    Sleep                               5
    Wait and Click                      ${BOTAO_COOKIES}

Wait and Click
    [Arguments]                         ${ELEMENTO}
    Wait Until Element is Visible       ${ELEMENTO}
    Wait Until Element is Enabled       ${ELEMENTO}
    Click Element                       ${ELEMENTO}