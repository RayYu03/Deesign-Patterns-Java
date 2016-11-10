from xml.etree import ElementTree as ET

class XMLUtil(object):
    @staticmethod
    def getBuildNames():
        try:
            tree = ET.parse('config.xml')
            root = tree.getroot()
        except:
            print('Error: cannot parse file: config.xml.')

        buildNames = list()

        for build in root.findall('className'):
            buildNames.append(build.text)
        return buildNames
